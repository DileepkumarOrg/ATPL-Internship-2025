import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DataBindingComp } from './data-binding-comp';

describe('DataBindingComp', () => {
  let component: DataBindingComp;
  let fixture: ComponentFixture<DataBindingComp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DataBindingComp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DataBindingComp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
