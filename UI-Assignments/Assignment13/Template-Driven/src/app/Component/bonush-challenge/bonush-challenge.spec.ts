import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BonushChallenge } from './bonush-challenge';

describe('BonushChallenge', () => {
  let component: BonushChallenge;
  let fixture: ComponentFixture<BonushChallenge>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BonushChallenge]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BonushChallenge);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
