import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeDashBoard } from './employee-dash-board';

describe('EmployeeDashBoard', () => {
  let component: EmployeeDashBoard;
  let fixture: ComponentFixture<EmployeeDashBoard>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmployeeDashBoard]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployeeDashBoard);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
